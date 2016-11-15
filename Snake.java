import javax.swing.*;

/**
 * Created by pi6220na on 11/15/2016.
 */
public class Snake extends JFrame {
    private JPanel Table;
    private JTable table1;

    protected Snake() {
        setContentPane(Table);
        pack();
        setVisible(true);

        // create data model and tell our table to use it
        HelloDataModel helloDataModel = new HelloDataModel;
        table1.setModel(helloDataModel);
    }
}
