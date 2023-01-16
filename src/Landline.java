import java.sql.SQLOutput;

public class Landline implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public Landline(String myPhoneNo, boolean isRinging, boolean isPowerOn) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = isRinging;
        this.isPowerOn = isPowerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn == true){
            System.out.println("You are dailing the no: "+phoneNo);
        }
        else {
            System.out.println("Your Landline is off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging =true;
            System.out.println("Hey, "+myPhoneNo+ " You are receiving a call");
        }
        else{
            System.out.println("Call not received");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging == true && isPowerOn ==true){
            System.out.println("Call answered");
            this.isRinging = false;
            return true;

        }
        return  false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
