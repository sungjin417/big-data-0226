package Comparable예제;

public class CarCompare implements Comparable<CarCompare>{
    String modelName;
    int modelYear;
    String color;

    public CarCompare(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarCompare o) {
        if(this.modelYear == o.modelYear) {
            return modelName.compareTo(o.modelName); // 중복 그대로 사용
        } else if(this.modelYear < o.modelYear) return -1; // 정렬 조건이 아님
        else return 1;
    }
}
