public class SingleRideMetroCard extends MetroCard
{

    // INSTANCE VARIABLES (if any)
    private boolean active;



    // CONSTRUCTOR(S)

    public SingleRideMetroCard() {
        super();
        active = true;
    }


    // METHODS (if any), including overridden methods
    @Override
    public boolean swipe()
    {
        if (active)
        {
            active = false;
            return true;
        }

        // not enough money or not activated
        return false;
    }

}
