package lesson06;


public class SubscriberServiceImpl {
    public static void main(String[] args) {
        SubscriberService ss = new SubscriberService() {
            @Override
            public void infoExceedTariffPlan(Subscriber[] subscribers, int realInnerCall) {
                SubscriberService.super.infoExceedTariffPlan(subscribers, realInnerCall);
            }
        };
        Subscriber arr[] = DataGenerator.getSubscriberArr();
//        ss.infoExceedTariffPlan(arr, 100 );
//        ss.infoOuterCall(arr);
//        ss.infoClientByFirstLetter(arr, "П");
//        ss.infoInternetConsumption(arr, "Одесса");
        ss.infoNegativeBalance(arr);

    }
}
