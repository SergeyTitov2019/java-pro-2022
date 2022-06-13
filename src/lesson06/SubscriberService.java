package lesson06;

import java.util.Locale;

public interface SubscriberService {

    default void infoExceedTariffPlan(Subscriber[] subscribers, int realInnerCall){
        System.out.println("Список абонентов, превысивших тарифный план внутригородских разговоров:");
        int count = 1;
        for(Subscriber s: subscribers){
            if(s.tariffForInnerCall < realInnerCall){
                System.out.println(count + ". " + s.lastName + ", " + s.firstName + " "+ s.middleName);
                count ++;
            }
        }
    }

    default void infoOuterCall(Subscriber[] subscribers){
        System.out.println("Список абонентов, которые пользовались междугородней связью:");
        int count = 1;
        for(Subscriber s: subscribers){
            if(s.outerCall > 0){
                System.out.println(count + ". " + s.lastName + ", " + s.firstName + " "+ s.middleName);
                count ++;
            }
        }
    }
    default void infoClientByFirstLetter(Subscriber[] subscribers, String letter){
        boolean flag = false;

        System.out.println("Абоненты, чьи фамилии начинаются с буквы '" + letter + "'");
        int count = 1;
        for(Subscriber s: subscribers){
            if(s.lastName.toLowerCase().split("")[0] .startsWith( letter.toLowerCase())){
                System.out.println(count + ". " + s.lastName + ", " + s.firstName + " "+ s.middleName + "; абонент № " + s.telephoneNumber + ", баланс: " + s.balance + " грн.");
                count ++;
            }
        }
    }
    default void infoInternetConsumption(Subscriber[] subscribers, String city){
        System.out.println("Суммарное потребление интернета по городу "+ city + ":");
        int sum = 0;
        for(Subscriber s: subscribers){
            if(s.homeCity == city){
                sum += s.internetTraffic;
            }
        }
        System.out.println(sum + " Gb");
    }
    default void infoNegativeBalance(Subscriber[] subscribers){
        System.out.println("Список абонентов с отрицательным балансом: ");

        for(Subscriber s: subscribers){
            int count = 1;
            if(s.balance < 0){
                System.out.println(count + ". " + s.lastName + ", " + s.firstName + " "+ s.middleName);
                count++;
            }
        }
    }

}
