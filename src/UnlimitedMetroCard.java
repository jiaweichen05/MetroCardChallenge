public class UnlimitedMetroCard extends MetroCard{
    private boolean sameStation, sevenDay;
    private int daysLeft;

    public UnlimitedMetroCard(boolean isSevenDay) {
        super();
        if (isSevenDay = true)
        {
            sevenDay = true;
            daysLeft = 7;
        }else {
            sevenDay = false;
            daysLeft = 30;
        }
    }

    @Override
    public boolean swipe()
    {
        if (!sameStation && daysLeft > 0)
        {
            sameStation = true;
            return true;
        }

        // not enough money or not activated
        return false;
    }

    public void nextDay()
    {
        daysLeft--;
    }

    public void switchStation()
    {
        sameStation = false;
    }
}
