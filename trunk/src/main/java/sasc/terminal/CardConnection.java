/*
 * Copyright 2010 sasc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sasc.terminal;

/**
 *
 * @author sasc
 */
public interface CardConnection {

    CardResponse transmit(byte[] cmd) throws TerminalException;

    byte[] getATR();

    Terminal getTerminal();

    String getConnectionInfo();
    
    String getProtocol();
    
    /**
     * Attempt a warm reset
     */
    void resetCard() throws TerminalException;

    /**
     *
     * @param attemptReset
     * @return true if the Provider supports card reset, and a reset was performed
     * @throws TerminalException
     */
    boolean disconnect(boolean attemptReset) throws TerminalException;
}
