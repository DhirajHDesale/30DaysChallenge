class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double ratioA = (double) a.value / a.weight;
                double ratioB = (double) b.value / b.weight;
                return Double.compare(ratioB, ratioA);
            }
        });

        double maxTotalValue = 0.0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + arr[i].weight <= W) {
                maxTotalValue += arr[i].value;
                currentWeight += arr[i].weight;
            } else {
                double remainingCapacity = W - currentWeight;
                maxTotalValue += (arr[i].value / (double) arr[i].weight) * remainingCapacity;
                break;
            }
        }

        return maxTotalValue;
    }
}