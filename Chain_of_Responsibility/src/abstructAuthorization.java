public abstract class  abstructAuthorization {
    protected abstructAuthorization nextAuth;

    public void setNextAuth(abstructAuthorization nextAuth){
        this.nextAuth = nextAuth;
    }

    public abstract void processRequest(long amount);
}
