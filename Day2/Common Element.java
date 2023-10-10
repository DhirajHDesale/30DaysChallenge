class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    { 
ArrayList<Integer> commonElementsList = new ArrayList<>();

       
        Arrays.sort(v1);
        Arrays.sort(v2);

        int i = 0, j = 0;

        while (i < v1.length && j < v2.length) {
            int num1 = v1[i];
            int num2 = v2[j];

            if (num1 == num2) {
                commonElementsList.add(num1);
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
        }
        return commonElementsList;
}}