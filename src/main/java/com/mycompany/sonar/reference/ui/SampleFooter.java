package com.mycompany.sonar.reference.ui;

import org.sonar.api.web.Footer;

public final class SampleFooter implements Footer {
  public String getHtml() {
    return "<p>Sample footer - <em>This is static HTML</em></p>";
  }
}
