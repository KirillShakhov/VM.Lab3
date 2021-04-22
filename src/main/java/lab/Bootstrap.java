package lab;
import lab.modules.MenuModule;
import lab.сommands.NumericalIntegrationRectangle;
import lab.сommands.NumericalIntegrationTrapezoid;

public class Bootstrap {
    public static void main(String[] args) {
        MenuModule main = new MenuModule();
        main.addCommand(new NumericalIntegrationRectangle());
        main.addCommand(new NumericalIntegrationTrapezoid());
        main.execute();
    }
}
