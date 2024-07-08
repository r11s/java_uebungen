package aufgabe_10_1;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.image.Image;

public class Model {

  int index = 0;

  private ArrayList<Image> images = new ArrayList<>();

  public void setImageList(File dir) {

    images.clear();

    for (File file : dir.listFiles()) {

      if (isImageFile(file.getName())) {
        Image image = new Image(file.toURI().toString());
        images.add(image);
      }

    }

  }

  private boolean isImageFile(String name) {
    if (name.endsWith(".bmp")) {
      return true;
    }

    if (name.endsWith(".jpg")) {
      return true;
    }

    if (name.endsWith(".jpeg")) {
      return true;
    }

    if (name.endsWith(".gif")) {
      return true;
    }

    if (name.endsWith(".png")) {
      return true;
    }

    return false;
  }

  public Image getFirstImage() {
    index = 0;
    if (images.size() > 0) {
      return images.get(index);
    }
    return null;
  }

  public Image getPreviousImage() {
    if (images.size() > 0) {
      if (index > 0) {
        index--;
        return images.get(index);
      }
    }
    return null;
  }

  public Image getNextImage() {
    if (images.size() > 0) {
      if (index < images.size() - 1) {
        index++;
        return images.get(index);
      }
    }
    return null;
  }

  public Image getLastImage() {
    if (images.size() > 0) {

      index = images.size() - 1;
      return images.get(index);
    }
    return null;
  }

}
