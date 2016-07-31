/*
 *     Copyright 2015-2016 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.dv8tion.jda.client.entities.impl;

import net.dv8tion.jda.client.JDAClient;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.entities.impl.JDAImpl;
import org.apache.http.HttpHost;

import javax.security.auth.login.LoginException;

public class JDAClientImpl extends JDAImpl implements JDAClient
{
    protected final HttpHost proxy;
    protected final boolean audioEnabled;
    protected final boolean useShutdownHook;
    protected final boolean bulkDeleteSplittingEnabled;

    public JDAClientImpl(HttpHost proxy, boolean audioEnabled, boolean useShutdownHook, boolean bulkDeleteSplittingEnabled)
    {
        this.proxy = proxy;
        this.audioEnabled = audioEnabled;
        this.useShutdownHook = useShutdownHook;
        this.bulkDeleteSplittingEnabled = bulkDeleteSplittingEnabled;

        if (audioEnabled)
            ;   //TODO: setup audio system


    }

    @Override
    public AccountType getAccountType()
    {
        return AccountType.CLIENT;
    }

    @Override
    public JDAClient asClient()
    {
        return this;
    }

    @Override
    public void login(String token) throws LoginException
    {
        super.login(token);
    }
}
