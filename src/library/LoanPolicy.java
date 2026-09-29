package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) {
        if (type == MemberType.STUDENT) {
            return 3;
        } else if (type == MemberType.FACULTY) {
            return 5;
        }
        return 2;
    }

    public int loanDays() {
        return 14;
    }

    public int overdueFee(int daysLate) {
        if (daysLate <= 0) {
            return 0;
        }
        return daysLate * 100;
    }
}