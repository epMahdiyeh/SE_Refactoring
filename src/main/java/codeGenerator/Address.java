package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public TypeAddress typeAdd;
    public varType varType;

    public Address(int num, varType varType, TypeAddress typeAdd) {
        this.num = num;
        this.typeAdd = typeAdd;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.typeAdd = new DirectAddress();
        this.varType = varType;
    }

    public String toString() {
        return typeAddress.toString(num);
    }
}
