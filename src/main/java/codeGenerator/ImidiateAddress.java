package codeGenerator;

public class ImidiateAddress implements TypeAddress {

    @Override
    public String toString(int num) {
        return "#" + num;
    }
}