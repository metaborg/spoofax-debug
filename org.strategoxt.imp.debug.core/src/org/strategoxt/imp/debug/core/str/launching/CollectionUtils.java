package org.strategoxt.imp.debug.core.str.launching;

import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils {

  private CollectionUtils() {}

  public static String join (Collection<String> s) {
    return CollectionUtils.join(s, "");
  }

  public static String join
  (Collection<String> s, String delimiter)
  {
    if (s == null || s.isEmpty()) return "";
    Iterator<String> iter = s.iterator();
    StringBuilder builder = new StringBuilder(iter.next());
    while( iter.hasNext() ) {
      builder.append(delimiter).append(iter.next().toString());
    }
    return builder.toString();
  }

}
