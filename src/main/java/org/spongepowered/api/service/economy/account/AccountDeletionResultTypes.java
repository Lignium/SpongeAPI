/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.service.economy.account;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 * Common {@link AccountDeletionResultType}s.
 */
public class AccountDeletionResultTypes {
    // SORTFIELDS:ON

    /**
     * Represents an account deletion where the account does not exist.
     */
    public static final AccountDeletionResultType ABSENT =
            DummyObjectProvider.createFor(AccountDeletionResultType.class, "ABSENT");

    /**
     * Represents an account deletion where the deletion failed.
     */
    public static final AccountDeletionResultType FAILED =
            DummyObjectProvider.createFor(AccountDeletionResultType.class, "FAILED");

    /**
     * Represents an account deletion where the deletion was successful.
     */
    public static final AccountDeletionResultType SUCCESS =
            DummyObjectProvider.createFor(AccountDeletionResultType.class, "SUCCESS");

    /**
     * Represents an account deletion where the deletion feature is unsupported.
     */
    public static final AccountDeletionResultType UNSUPPORTED =
            DummyObjectProvider.createFor(AccountDeletionResultType.class, "UNSUPPORTED");

    /**
     * Represents an account deletion where the account could not be deleted.
     */
    public static final AccountDeletionResultType UNDELETABLE =
            DummyObjectProvider.createFor(AccountDeletionResultType.class, "UNDELETABLE");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private AccountDeletionResultTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
