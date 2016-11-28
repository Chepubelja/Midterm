enum Pass_type {
    Working_day, Weekend_day, Hole_season;
    public String toString() {
        switch (this) {
            case Working_day:
                return "Working_day";
            case Weekend_day:
                return "Weekend_day";
            case Hole_season:
                return "Hole_season";
            default:
                return "No_type";
        }
    }
}
