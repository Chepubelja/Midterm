public class Ski_pass {
    protected Amount_of_days amount_of_days;
    protected Pass_spec pass_spec;
    public Ski_pass(Pass_type pass_type, Amount_of_days amount_of_days, int amount_of_liftings,
                    int unic_modintifier, boolean validity, Pass_spec pass_spec){
        this.pass_spec = new Pass_spec(unic_modintifier, pass_type, validity, amount_of_liftings);
        if (pass_spec.pass_type.toString().equals("Working_day")){
            if (amount_of_days.toInt() != 1 || amount_of_days.toInt() != 2 || amount_of_days.toInt() != 5){
                System.out.println("Error, please choose correct number of days - (1 or 2 or 5)");
            }
            else
                this.pass_spec.amount_of_liftings = amount_of_liftings;
            }
        else if (pass_spec.pass_type.toString().equals("Weekend_day")){
            if(amount_of_days.toInt() != 1 || amount_of_days.toInt() != 2){
                System.out.println("Error, please choose correct number of days - (1 or 2)");
            }
        }
        else {
            this.amount_of_days = amount_of_days;
        }
        if (pass_spec.pass_type.toString().equals("Whole_season")){
            this.pass_spec.amount_of_liftings = amount_of_liftings;
        }
        else
            if (pass_spec.amount_of_liftings  != 10 || pass_spec.amount_of_liftings  != 20
                    || pass_spec.amount_of_liftings  != 50 || pass_spec.amount_of_liftings != 100){
                System.out.println("Error, please choose correct number of liftings - (10, 20, 50 or 100)");
            }
            else
                this.pass_spec.amount_of_liftings  = amount_of_liftings;
    }

    public Amount_of_days getAmount_of_days() {
        return amount_of_days;
    }

    public void setAmount_of_days(Amount_of_days amount_of_days) {
        this.amount_of_days = amount_of_days;
    }

    public Pass_spec getPass_spec() {
        return pass_spec;
    }

    public void setPass_spec(Pass_spec pass_spec) {
        this.pass_spec = pass_spec;
    }


}
