enum Amount_of_days {
    One_day, Two_days, Five_days;
    public int toInt() {
        switch (this) {
            case One_day:
                return 1;
            case Two_days:
                return 2;
            case Five_days:
                return 5;
            default:
                return 0;
        }
    }
}
