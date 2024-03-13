package 제네릭프린터;
// 타입 변수로 입력되는 형태는 재료를 의미
public class GenericPrinter<T> {
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
}
