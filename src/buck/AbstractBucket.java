package buck;

/**
 *
 * @author khoi.a.hoang
 */
public abstract class AbstractBucket {

    protected String bucketId;

    public AbstractBucket(String bucketId) {
        this.bucketId = bucketId;
    }

    public String getBucketId() {
        return bucketId;
    }
}
