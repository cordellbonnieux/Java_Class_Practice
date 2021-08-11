import java.util.*;
import javax.swing.*;

public class Search {

    public static void main(String[] args) {

        // create search objects
        BinarySearch binary = new BinarySearch();

        // create options panel
        JPanel options = optionsPanel();

        // Ask the user what they'd like to do
        String choice = JOptionPane.showInputDialog(null, options);

        switch (choice) {
            
        }




        //System.out.println(binary.search(list, 12));

    }

    /**
     * A method for creating the options panel
     * @return returns a j panel with all the tasks the user can perform
     */
    public static JPanel optionsPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        JPanel c = new JPanel();
        panel.add(c);

        JLabel choose = new JLabel("What would you like to do?");
        c.add(choose);        

        JLabel option1 = new JLabel("Enter a new list: 1");
        c.add(option1);

        JLabel option2 = new JLabel("View current list: 2");
        c.add(option2);

        JLabel option3 = new JLabel("Quick Sort: 3");
        c.add(option3);

        JLabel option4 = new JLabel("Binary Search: 4");
        c.add(option4);

        JLabel option5 = new JLabel("Linear Search: 5");
        c.add(option5);

        return panel;
    }

    /**
     * Gets a list of integers from the user
     * @return an array of integers
     */
    public static int[] getList() {

        // get user input
        String input = JOptionPane.showInputDialog(null, "Enter a list of integers separated by commas (,): ");

        // convert input to an array of integers
        String[] string = input.split(",");

        int[] list = new int[string.length];

        for (int i = 0; i < string.length; i++)
            try {
                list[i] = Integer.parseInt(string[i]);
            } catch (Exception e) {
                System.out.println("Error parsing string");
            }
        
        return list;
    }
}