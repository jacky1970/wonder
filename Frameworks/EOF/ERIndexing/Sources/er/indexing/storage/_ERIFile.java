// $LastChangedRevision: 7683 $ DO NOT EDIT.  Make changes to ERIFile.java instead.
package er.indexing.storage;

import er.extensions.foundation.*;
import er.extensions.eof.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;


@SuppressWarnings("all")
public abstract class _ERIFile extends ERXGenericRecord {

	public static final String ENTITY_NAME = "ERIFile";

    public interface Key {
	// Attributes
	   public static final String LAST_MODIFIED = "lastModified";
	   public static final String LENGTH = "length";
	   public static final String NAME = "name";

	// Relationships
	   public static final String CONTENT = "content";
	   public static final String DIRECTORY = "directory";
    }

    public static class _ERIFileClazz extends ERXGenericRecord.ERXGenericRecordClazz<ERIFile> {
        /* more clazz methods here */
    }

  public NSTimestamp lastModified() {
    return (NSTimestamp) storedValueForKey(Key.LAST_MODIFIED);
  }
  public void setLastModified(NSTimestamp value) {
    takeStoredValueForKey(value, Key.LAST_MODIFIED);
  }

  public Long length() {
    return (Long) storedValueForKey(Key.LENGTH);
  }
  public void setLength(Long value) {
    takeStoredValueForKey(value, Key.LENGTH);
  }

  public String name() {
    return (String) storedValueForKey(Key.NAME);
  }
  public void setName(String value) {
    takeStoredValueForKey(value, Key.NAME);
  }

  public er.indexing.storage.ERIFileContent content() {
    return (er.indexing.storage.ERIFileContent)storedValueForKey(Key.CONTENT);
  }
  public void setContent(er.indexing.storage.ERIFileContent value) {
    takeStoredValueForKey(value, Key.CONTENT);
  }

  public er.indexing.storage.ERIDirectory directory() {
    return (er.indexing.storage.ERIDirectory)storedValueForKey(Key.DIRECTORY);
  }
  public void setDirectory(er.indexing.storage.ERIDirectory value) {
    takeStoredValueForKey(value, Key.DIRECTORY);
  }

}
