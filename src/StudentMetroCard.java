public class StudentMetroCard extends MetroCard
{
    // INSTANCE VARIABLES (if any)
    private int remainingSwipes;


    // CONSTRUCTOR(S)

    public StudentMetroCard() {
        super();
        remainingSwipes = 3;
    }


    // METHODS (if any), including overridden methods
    @Override
    public boolean swipe()
    {
        if (remainingSwipes >= 1)
        {
            remainingSwipes--;
            return true;
        }

        // not enough money or not activated
        return false;
    }

    public void resetSwipes()
    {
        remainingSwipes = 3;
    }

}