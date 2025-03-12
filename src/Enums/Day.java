public enum  Day {
    
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),  
    Saturday(7);
    private  final int dayNumber;
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }
    public int getDayNumber() {
        return dayNumber;
    }
}
