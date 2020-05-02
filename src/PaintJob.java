public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }

        double wallArea = width * height;
        int bucketNeeded = 0;
        bucketNeeded = (int) (Math.ceil(wallArea / areaPerBucket)) - extraBucket;
        return bucketNeeded;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double wallArea = width * height;
        int bucketNeeded = 0;

        bucketNeeded = (int) (Math.ceil(wallArea / areaPerBucket));
        return bucketNeeded;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketNeeded = 0;
        bucketNeeded = (int) Math.ceil(area / areaPerBucket);
        return bucketNeeded;
    }
}
