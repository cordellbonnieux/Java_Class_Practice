import javax.swing.*;

public class Search {

    public static void main(String[] args) {

        // create search objects
        BinarySearch binary = new BinarySearch();
        LinearSearch linear = new LinearSearch();
        QuickSort quick = new QuickSort();

        // create options panel
        JPanel options = optionsPanel();

        // get a list
        int[] list = getList();

        while (list.length > 0){

            // Ask the user what they'd like to do
            String input = JOptionPane.showInputDialog(null, options);
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1: list = getList();
                    break;

                case 2: String stringList = "";
                    for (int i = 0; i < list.length; i++) stringList += i < list.length - 1 ? list[i] + ", " : list[i];
                    JOptionPane.showMessageDialog(null, stringList);
                    break;
                
                case 3:
                    if (!isSorted(list))
                        list = quick.sort(list);
                    else 
                        JOptionPane.showMessageDialog(null, "Your list is already sorted");
                    break;
                
                case 4: 
                    if (isSorted(list)) {
                        String selection = JOptionPane.showInputDialog(null, "What number are you looking for in your list?");
                        int key = Integer.parseInt(selection);
                        int index = binary.search(list, key);
                        if (index < 0)
                            JOptionPane.showMessageDialog(null, "Looks like the key: " + key + " could not be found in your list.");
                        else 
                        JOptionPane.showMessageDialog(null, "The key: " + key + " is located at index: " + index + " in your list.");

                    } else 
                        JOptionPane.showMessageDialog(null, "You need to sort the list before you can perform binary search.");
                    break;

                case 5:
                    String selection = JOptionPane.showInputDialog(null, "What number are you looking for in your list?");
                    int key = Integer.parseInt(selection);
                    int index = linear.search(list, key);
                    if (index < 0)
                        JOptionPane.showMessageDialog(null, "Looks like the key: " + key + " could not be found in your list.");
                    else 
                        JOptionPane.showMessageDialog(null, "The key: " + key + " is located at index: " + index + " in your list.");
                    break;
                
                case 6: System.exit(0);
            }
        }
    }

    /**
     * A method for creating the options panel
     * @return returns a j panel with all the tasks the user can perform
     */
    public static JPanel optionsPanel() {

        JPanel panel = new JPanel();
        JPanel c = new JPanel();
        c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
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

        JLabel option6 = new JLabel("Exit program: 6");
        c.add(option6);

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

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            if (i < arr.length - 1)
                if (arr[i] > arr[i + 1])
                    return false;
        return true;
    }
}