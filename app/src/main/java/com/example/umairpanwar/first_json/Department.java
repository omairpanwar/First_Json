package com.example.umairpanwar.first_json;

public class Department {

    String name;
    String blocks;
    int code;
   // public Department(){}

    public Department(String name, String blocks, int code) {
        this.name = name;
        this.blocks = blocks;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
