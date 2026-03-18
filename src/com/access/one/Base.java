package com.access.one;

public class Base {
    public void showPublic() {
        System.out.println("Public Method");
    }

    protected void showProtected() {
        System.out.println("Protected Method");
    }

    void showDefault() {
        System.out.println("Default Method");
    }

    private void showPrivate() {
        System.out.println("Private Method");
    }
}