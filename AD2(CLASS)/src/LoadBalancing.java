
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoadBalancing {

    public static void main(String[] args) {
        int m = 3; // Number of processors
        List<Integer> jobs = Arrays.asList(2, 2, -1, 3, 1, -4); // Load of jobs

        LoadBalancing lb = new LoadBalancing();
        Result result = lb.loadBalancing(m, jobs);

        System.out.println("Job Assignments to Processors: " + result.assignments);
        System.out.println("Maximum Load on Any Processor: " + result.maxLoad);
    }

    public Result loadBalancing(int m, List<Integer> jobs) {
        // Step 1: Initialize
        int[] processors = new int[m];
        List<List<Integer>> assignments = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            assignments.add(new ArrayList<>());
        }

        // Step 2: Sort jobs in descending order
        Collections.sort(jobs, Collections.reverseOrder());

        // Step 3: Assign jobs to processors
        for (int job : jobs) {
            int minLoadProcessor = findMinLoadProcessor(processors);
            processors[minLoadProcessor] += job;
            assignments.get(minLoadProcessor).add(job);
        }

        // Step 4: Calculate the maximum load on any processor
        int maxLoad = Arrays.stream(processors).max().getAsInt();

        // Step 5: Return the assignments and the maximum load
        return new Result(assignments, maxLoad);
    }

    private int findMinLoadProcessor(int[] processors) {
        int minLoadProcessor = 0;
        for (int i = 1; i < processors.length; i++) {
            if (processors[i] < processors[minLoadProcessor]) {
                minLoadProcessor = i;
            }
        }
        return minLoadProcessor;
    }

    class Result {
        List<List<Integer>> assignments;
        int maxLoad;

        Result(List<List<Integer>> assignments, int maxLoad) {
            this.assignments = assignments;
            this.maxLoad = maxLoad;
        }
    }
}
