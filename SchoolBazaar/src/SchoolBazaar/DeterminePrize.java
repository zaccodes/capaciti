package SchoolBazaar;

public class DeterminePrize {
    public double getPrize(int ticketNumber, char gender){
        if(gender == 'm' && ticketNumber > 30000){
            return ticketNumber/90.00;
        } else if(gender == 'f' && ticketNumber > 20000){
            return ticketNumber/80.00;
        }else {
            return 0;
        }
    }

    public int getPrize(int ticketNumber, int age){
        if(age <= 21){
            return age * 40;
        } else if( age > 21){
            return age * 30;
        }else {
           return 0;
        }
    }
}
