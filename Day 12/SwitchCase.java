 double area = 0.0;

        switch (choice) {
            case 1:
                // Calculate the area of a circle
                if (arr.size() >= 1) {
                    double radius = arr.get(0);
                    area = calculateCircleArea(radius);
                } else {
                    System.out.println("Not enough values provided for a circle.");
                }
                break;
            case 2:
                // Calculate the area of a rectangle
                if (arr.size() >= 2) {
                    double length = arr.get(0);
                    double breadth = arr.get(1);
                    area = calculateRectangleArea(length, breadth);
                } else {
                    System.out.println("Not enough values provided for a rectangle.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 for circle or 2 for rectangle.");
                break;
        }

        return area;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }