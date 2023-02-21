package ch16;

public class Button {

    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button btn = new Button();

        btn.setClickListener(() -> {
            System.out.println("Ok 버튼");
        });
        btn.click();

        Button btnCancel = new Button();

        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼");
        });

        btnCancel.click();
    }
}


