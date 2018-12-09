package com.an.biometric;

import android.hardware.biometrics.BiometricPrompt;

import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

public class BiometricAuthenticationResult {

    private final FingerprintManagerCompat.CryptoObject mFingerprintManagerCryptoObject;
    private final BiometricPrompt.CryptoObject mBiometricPromptCryptoObject;

    public BiometricAuthenticationResult(FingerprintManagerCompat.CryptoObject crypto) {
        mFingerprintManagerCryptoObject = crypto;
        mBiometricPromptCryptoObject = null;
    }

    public BiometricAuthenticationResult(BiometricPrompt.CryptoObject crypto) {
        mFingerprintManagerCryptoObject = null;
        mBiometricPromptCryptoObject = crypto;
    }

    public FingerprintManagerCompat.CryptoObject getFingerprintManagerCryptoObject() { return mFingerprintManagerCryptoObject; }
    public BiometricPrompt.CryptoObject getBiometricPromptCryptoObject() { return mBiometricPromptCryptoObject; }
}
