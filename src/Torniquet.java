public class Torniquet extends Ski_pass{
    public Torniquet(Pass_type pass_type, Amount_of_days amount_of_days, int amount_of_liftings, int unic_modintifier, boolean validity, Pass_spec pass_spec) {
        super(pass_type, amount_of_liftings, unic_modintifier, validity, pass_spec);
    }
    int counter = 0;
    private Ski_pass[] distinct;

    boolean check(Ski_pass ski_pass){
        boolean ifRight = false;
        if (!ski_pass.pass_spec.validity || !Distinct_unic_modintifier(ski_pass)
                || ski_pass.pass_spec.amount_of_liftings == 0){
        }
        else
            ifRight = true;
    return ifRight;
    }
    private boolean Distinct_unic_modintifier(Ski_pass ski_pass){
        boolean dist = false;
        for (Ski_pass ski_pass1: distinct){
            if (ski_pass != ski_pass1){
                dist = true;
            }
            else
                dist = false;
        }
        return dist;
    }
    private void release(Ski_pass ski_pass){
        if (check(ski_pass)){
            addTo(ski_pass);
            ski_pass.pass_spec.amount_of_liftings -= 1;
            System.out.println("You have succesfully released new Ski-pass of type " + ski_pass.getPass_spec().getPass_type());
        }
        else
            System.out.println("Something is wrong with your Ski-pass");
    }
    private void addTo(Ski_pass ski_pass){
        distinct[counter] = ski_pass;
        counter++;
    }

}
