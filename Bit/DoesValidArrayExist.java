class DoesValidArrayExist {
    public static void main(String[] args) {
        DoesValidArrayExist obj = new DoesValidArrayExist();
        int[] derived = {1, 2, 3, 4, 5};
        System.out.println(obj.doesValidArrayExist(derived));
    }
    public boolean doesValidArrayExist(int[] derived) {
        int result =0;
        for(int i=0; i<derived.length; i++){
            result ^=derived[i];
        }
        return result==0;
    }
}