package Exercises.Gifts;

class Package {
    private String color;
    private String material;

    public Package(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Packaging: [color=" + color + ", material=" + material + "]";
    }
}