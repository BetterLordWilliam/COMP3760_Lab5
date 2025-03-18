import java.io.FileNotFoundException;

/**
 * Testing class.
 */
public class Driver
{
    /**
     * Program entry.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        JobAssignmentFinder jf = new JobAssignmentFinder();
        String[] files = {
            "data0.txt", "data1.txt", "data2.txt", "data3.txt", "data4.txt", "data5.txt",
            "data11.txt", "data12.txt", "data37.txt", "data148.txt", "donutdata.txt"
        };
        try {
            for (String f : files) {
                jf.readDataFile(f);
                System.out.println(f);
                System.out.println("Size of the benefit matrix: " + jf.getInputSize());
                // System.out.println(jf.benefitMatrixToString());

                // Run it all
                if (f.equals("donutdata.txt"))
                {
                    System.out.println("Maximum assignment permutation: " + jf.getMaxAssignment());
                    System.out.println("Maximum assignment value: " + jf.getMaxAssignmentTotalValue());
                    System.out.println("\n");
                    System.out.println("Greedy 1 maximum assignment permutation: " + jf.getGreedyAssignment());
                    System.out.println("Greedy 1 assignment value: " + jf.greedyAssignmentTotalValue());
                    System.out.println("\n");
                    // System.out.println("Greedy 2 maximum assignment permutation: " + jf.getGreedyAssignment());
                    // System.out.println("Greedy 2 assignment value: " + jf.greedyAssignmentTotalValue());
                    // System.out.println("\n");
                }
                // Only run greedy
                else
                {
                    System.out.println("Greedy 1 maximum assignment permutation: " + jf.getGreedyAssignment());
                    System.out.println("Greedy 1 assignment value: " + jf.greedyAssignmentTotalValue());
                    System.out.println("\n");
                    // System.out.println("Greedy 2 maximum assignment permutation: " + jf.getGreedyAssignment());
                    // System.out.println("Greedy 2 assignment value: " + jf.greedyAssignmentTotalValue());
                    // System.out.println("\n");
                }
            }
        } catch (FileNotFoundException e) {
        }  
    }
}