package uk.gov.dvla.domain.mib;

public enum TestPassStatus {
    Claimed(0, "Claimed"),
    Unclaimed(1, "Unclaimed"),
    Cancelled(2, "Cancelled");

    public int getTestPassStatus()
    {
        return value;
    }

    private int value;
    private String valueName;

    private TestPassStatus(int value, String valueName) {
        this.value = value;
        this.valueName = valueName;
    }
}