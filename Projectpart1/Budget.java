public class Budget{
    public static void main(String[] args) {
        
        // create all the variable needed to calculate.
        double monthlyRent = 625;
        double monthlyinternet = 27;
        double monthlyGrocery = 250;
        double monthlyAllowance = 150;
        double monthlySaving = 100;
        double hourlyWage = 10;
        double workHour = 0, workHourwSav = 0;

        // calculate how many hour the student need to work to break even.
        // the reason why we add 0.99 and cast it into "int" is because maybe they need to work for 30mins to meet the exspense. 
        //However, they only get pay by hour so we need to round up there work hour so they can meet that. if we don't java will round down and the studen twill be in debt.
        workHour = (int)((monthlyRent + monthlyinternet + monthlyGrocery + monthlyAllowance) / hourlyWage + 0.99);
        
        // calculate the work hour if they need $100 saving.
        workHourwSav = workHour + monthlySaving / hourlyWage;

        // print out hourlyWage.
        System.out.println("hourly wage which is $"+hourlyWage);
        
        // print out monthy exspense
        System.out.println("$"+monthlyRent+" for rent.");
        System.out.println("$"+monthlyinternet+" for internet.");
        System.out.println("$"+monthlyGrocery+" for Grocery.");
        System.out.println("$"+monthlyAllowance+" for Allowance.");
        
        // print out total exspense
        System.out.println("Total monthly expense: $"+(monthlyRent + monthlyinternet + monthlyGrocery + monthlyAllowance));
        
        // print out work hour
        System.out.println("number of hour that student need to work to meet monthly exspense: "+workHour+"hrs");

        // print out work hour with $100 saving
        System.out.println("number of hour that student need to work to meet monthly exspense plus saving: "+workHourwSav+"hrs");
    }
}
