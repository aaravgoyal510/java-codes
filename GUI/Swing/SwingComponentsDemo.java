// SwingComponentsDemo.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponentsDemo extends JFrame implements ActionListener {
    // Declare components
    JLabel lblName, lblGender, lblLanguage, lblCountry, lblOutput;
    JTextField txtName;
    JRadioButton male, female;
    JCheckBox chkJava, chkPython;
    JComboBox<String> country;
    JTextArea outputArea;
    JButton btnSubmit, btnClear;
    ButtonGroup genderGroup;

    public SwingComponentsDemo() {
        // Set frame title
        setTitle("Swing Components Demo");

        // Set layout
        setLayout(new FlowLayout());

        // Create components
        lblName = new JLabel("Enter your name:");
        txtName = new JTextField(20);

        lblGender = new JLabel("Gender:");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        lblLanguage = new JLabel("Known Languages:");
        chkJava = new JCheckBox("Java");
        chkPython = new JCheckBox("Python");

        lblCountry = new JLabel("Select Country:");
        String[] countries = {"India", "USA", "UK", "Canada"};
        country = new JComboBox<>(countries);

        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");

        lblOutput = new JLabel("Output:");
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        outputArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));

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
        add(new JScrollPane(outputArea)); // scrollable text area

        // Register button listeners
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);

        // Frame settings
        setSize(420, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null); // center the window
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String name = txtName.getText();
            String gender = male.isSelected() ? "Male" :
                            female.isSelected() ? "Female" : "Not selected";

            String languages = "";
            if (chkJava.isSelected()) languages += "Java ";
            if (chkPython.isSelected()) languages += "Python ";
            if (languages.isEmpty()) languages = "None";

            String selectedCountry = (String) country.getSelectedItem();

            outputArea.setText("Name: " + name +
                               "\nGender: " + gender +
                               "\nLanguages: " + languages +
                               "\nCountry: " + selectedCountry);
        } else if (e.getSource() == btnClear) {
            txtName.setText("");
            genderGroup.clearSelection();
            chkJava.setSelected(false);
            chkPython.setSelected(false);
            country.setSelectedIndex(0);
            outputArea.setText("");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        // Run GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new SwingComponentsDemo());
    }
}
