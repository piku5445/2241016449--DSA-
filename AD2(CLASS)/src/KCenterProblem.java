
import java.util.ArrayList;
import java.util.List;

public class KCenterProblem {

    public static void main(String[] args) {
        // Example usage
        int[][] points = {
            {0, 0}, {1, 2}, {3, 1}, {5, 4}, {6, 1}, {8, 3}, {9, 7}
        };
        int k = 3;

        List<int[]> centers = findKCenters(points, k);
        
        System.out.println("Selected centers:");
        for (int[] center : centers) {
            System.out.println("[" + center[0] + ", " + center[1] + "]");
        }
    }

    public static List<int[]> findKCenters(int[][] points, int k) {
        List<int[]> centers = new ArrayList<>();
        boolean[] isCenter = new boolean[points.length];
        
        // Step 1: Choose an arbitrary point as the first center
        centers.add(points[0]);
        isCenter[0] = true;

        // Step 2: Iteratively select the point farthest from the current set of centers
        for (int i = 1; i < k; i++) {
            int[] farthestPoint = null;
            double maxDist = -1;
            
            for (int j = 0; j < points.length; j++) {
                if (!isCenter[j]) {
                    double minDistToCenters = Double.MAX_VALUE;
                    for (int[] center : centers) {
                        double dist = euclideanDistance(points[j], center);
                        if (dist < minDistToCenters) {
                            minDistToCenters = dist;
                        }
                    }
                    if (minDistToCenters > maxDist) {
                        maxDist = minDistToCenters;
                        farthestPoint = points[j];
                    }
                }
            }
            
            centers.add(farthestPoint);
            for (int j = 0; j < points.length; j++) {
                if (points[j] == farthestPoint) {
                    isCenter[j] = true;
                    break;
                }
            }
        }
        
        return centers;
    }

    private static double euclideanDistance(int[] point1, int[] point2) {
        int dx = point1[0] - point2[0];
        int dy = point1[1] - point2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
