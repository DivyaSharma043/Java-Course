package PolymorphismProject;

interface Mouse
{
    void LeftBtnDown(int x, int y);
    void RightBtnDown(int x, int y);
}

class GeniusMouse implements Mouse
{
    @Override
    public void LeftBtnDown(int x, int y)
    {
        System.out.println("Left Button: "+ x + "  "+ y);
    }
    
    @Override
    public void RightBtnDown(int x, int y)
    {
        System.out.println("Right Button: "+ x + "  "+ y);
    }

    }

public class InterfaceUsage {
    public static void main(String[] args)
    {
        GeniusMouse m = new GeniusMouse();
        m.LeftBtnDown(12, 23);
        m.RightBtnDown(34, 45);
    }
}
