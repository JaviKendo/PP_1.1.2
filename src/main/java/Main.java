public class Main {
  public static void main(String[] args) {
    System.out.println("1");
    System.out.println("2");
    System.out.println(1);
  }

  @Deprecated
  private void uploadFileToTerabyte(UploaderFileModel fileModel) {
    try {
        upload(
            fileModel.getFileString().getBytes(),
            fileModel.getFileString(),
            ObjectType.TEMP,
            fileModel.getFileName(),
            fileModel.getFileName(),
            fileModel.getMimeType(),
            null,
            ObjectType.REST);
    } catch (Exception e) {
      //            log.error("Couldn't upload xml file to terabyte", e);
      throw new RuntimeException(e);
    }
  }

  private void upload(
      byte[] b,
      String s,
      ObjectType ot,
      String s1,
      String s2,
      String s3,
      String s4,
      ObjectType ot1) {
    System.out.println(
        ot + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s
            + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s
            + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s + s
            + s + s + s + s + s + s + s1);
  }

  private enum ObjectType {
    TEMP,
    REST
  }

  class UploaderFileModel {
    String objectId;
    String fileString;
    String fileName;
    String mimeType;

    public String getObjectId() {
      return objectId;
    }

    public void setObjectId(String objectId) {
      this.objectId = objectId;
    }

    public String getFileString() {
      return fileString;
    }

    public void setFileString(String fileString) {
      this.fileString = fileString;
    }

    public String getFileName() {
      return fileName;
    }

    public void setFileName(String fileName) {
      this.fileName = fileName;
    }

    public String getMimeType() {
      return mimeType;
    }

    public void setMimeType(String mimeType) {
      this.mimeType = mimeType;
    }
  }
}
