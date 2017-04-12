/*
 * Copyright (c) 2002-2016, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package lib.jline.console;

/**
 * This exception is thrown by {@link ConsoleReader#readLine} when
 * user interrupt handling is enabled and the user types the
 * interrupt character (ctrl-C). The partially entered line is
 * available via the {@link #getPartialLine()} method.
 */
public class UserInterruptException
    extends RuntimeException
{
    private static final long serialVersionUID = 6172232572140736750L;

    private final String partialLine;

    public UserInterruptException(String partialLine)
    {
        this.partialLine = partialLine;
    }

    /**
     * @return the partially entered line when ctrl-C was pressed
     */
    public String getPartialLine()
    {
        return partialLine;
    }
}
