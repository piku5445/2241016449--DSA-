import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double ratioA = (double) a.value / a.weight;
        double ratioB = (double) b.value / b.weight;
        if (ratioA < ratioB) {
            return 1;
        } else if (ratioA > ratioB) {
            return -1;
        } else {
            return 0;
        }
    }
}

class FractionalKnapsack {
    double fractionalKnapsack(int W, Item[] items) {
        Arrays.sort(items, new ItemComparator());

        int curWeight = 0;
        double finalValue = 0.0;

        for (Item item : items) {
            if (curWeight + item.weight <= W) {
                curWeight += item.weight;
                finalValue += item.value;
            } else {
                int remainingWeight = W - curWeight;
                finalValue += (double) item.value / item.weight * remainingWeight;
                break;
            }
        }

        return finalValue;
    }
}

public class knapsackproblem {
    public static void main(String[] args) {
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;

        FractionalKnapsack knapsack = new FractionalKnapsack();
        double maxValue = knapsack.fractionalKnapsack(capacity, items);

        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
