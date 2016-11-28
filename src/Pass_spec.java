class Pass_spec {
    int unic_modintifier;
    Pass_type pass_type;
    boolean validity;

    int amount_of_liftings;

    Pass_spec(int unic_modintifier, Pass_type pass_type, boolean validity, int amount_of_liftings){
        this.unic_modintifier = unic_modintifier;
        this.pass_type = pass_type;
        this.validity = validity;
        this.amount_of_liftings = amount_of_liftings;
    }
    public Pass_type getPass_type() {
        return pass_type;
    }

    public void setPass_type(Pass_type pass_type) {
        this.pass_type = pass_type;
    }
    public int getUnic_modintifier() {
        return unic_modintifier;
    }

    public void setUnic_modintifier(int unic_modintifier) {
        this.unic_modintifier = unic_modintifier;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }
    public int getAmount_of_liftings() {
        return amount_of_liftings;
    }

    public void setAmount_of_liftings(int amount_of_liftings) {
        this.amount_of_liftings = amount_of_liftings;
    }
}
