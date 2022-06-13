package lesson06;

public class Subscriber {

    String id;
    String lastName;
    String firstName;
    String middleName;
    String homeCity;
    String telephoneNumber;
    String contractNumber;
    int balance;
    int tariffForInnerCall; //min
    int outerCall; //min
    int internetTraffic; //Gb

    public Subscriber(String id,  String firstName, String middleName,String lastName, String homeCity,
                      String telephoneNumber, String contractNumber, int balance,
                      int tariffForInnerCall, int outerCall,
                      int internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.homeCity = homeCity;
        this.telephoneNumber = telephoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.tariffForInnerCall = tariffForInnerCall;
        this.outerCall = outerCall;
        this.internetTraffic = internetTraffic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTariffForInnerCall() {
        return tariffForInnerCall;
    }

    public void setTariffForInnerCall(int tariffForInnerCall) {
        this.tariffForInnerCall = tariffForInnerCall;
    }

    public int getOuterCall() {
        return outerCall;
    }

    public void setOuterCall(int outerCall) {
        this.outerCall = outerCall;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", homeCity='" + homeCity + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", tariffForInnerCall=" + tariffForInnerCall +
                ", tariffForOuterCall=" + outerCall +
                ", tariffForInternet=" + internetTraffic +
                '}';
    }
}
