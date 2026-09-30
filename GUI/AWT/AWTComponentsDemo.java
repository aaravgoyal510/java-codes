// AWTComponentsDemo.java
import java.awt.*;
import java.awt.event.*;

public class AWTComponentsDemo extends Frame implements ActionListener {
    // Declare components
    Label lblName, lblGender, lblLanguage, lblCountry, lblOutput;
    TextField txtName;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Checkbox chkJava, chkPython;
    Choice country;
    TextArea outputArea;
    Button btnSubmit, btnClear;

    public AWTComponentsDemo() {
        // Set frame title
        setTitle("AWT Components Demo");

        // Set layout
        setLayout(new FlowLayout());

        // Create components
        lblName = new Label("Enter your name:");
        txtName = new TextField(20);

        lblGender = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        lblLanguage = new Label("Known Languages:");
        chkJava = new Checkbox("Java");
        chkPython = new Checkbox("Python");

        lblCountry = new Label("Select Country:");
        country = new Choice();
        country.add("India");
        country.add("USA");
        country.add("UK");
        country.add("Canada");

        btnSubmit = new Button("Submit");
        btnClear = new Button("Clear");

        lblOutput = new Label("Output:");
        outputArea = new TextArea(5, 30);
        outputArea.setEditable(false);

        // Add components to frame
        add(lblName);
        add(txtName);
        add(lblGender);
        add(male);
        add(female);
        add(lblLanguage);
        add(chkJava);
        add(chkPython);
        add(lblCountry);
        add(country);
        add(btnSubmit);
        add(btnClear);
        add(lblOutput);
        add(outputArea);

        // Register button listeners
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);

        // Set frame size and visibility
        setSize(400, 400);
        setVisible(true);

        // Close window using X button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String name = txtName.getText();
            String gender = genderGroup.getSelectedCheckbox() != null
                            ? genderGroup.getSelectedCheckbox().getLabel()
                            : "Not selected";

            String languages = "";
            if (chkJava.getState()) languages += "Java ";
            if (chkPython.getState()) languages += "Python ";
            if (languages.isEmpty()) languages = "None";

            String selectedCountry = country.getSelectedItem();

            outputArea.setText("Name: " + name +
                               "\nGender: " + gender +
                               "\nLanguages: " + languages +
                               "\nCountry: " + selectedCountry);
        } else if (e.getSource() == btnClear) {
            txtName.setText("");
            genderGroup.setSelectedCheckbox(null);
            chkJava.setState(false);
            chkPython.setState(false);
            country.select(0);
            outputArea.setText("");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        new AWTComponentsDemo();
    }
}
