/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.LayoutShadowNode;

public class SliderManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & SliderManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public SliderManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "disabled":
        mViewManager.setDisabled(view, value == null ? false : (boolean) value);
        break;
      case "enabled":
        mViewManager.setEnabled(view, value == null ? true : (boolean) value);
        break;
      case "maximumTrackImage":
        mViewManager.setMaximumTrackImage(view, (ReadableMap) value);
        break;
      case "maximumTrackTintColor":
        mViewManager.setMaximumTrackTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "maximumValue":
        mViewManager.setMaximumValue(view, value == null ? 1f : ((Double) value).doubleValue());
        break;
      case "minimumTrackImage":
        mViewManager.setMinimumTrackImage(view, (ReadableMap) value);
        break;
      case "minimumTrackTintColor":
        mViewManager.setMinimumTrackTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "minimumValue":
        mViewManager.setMinimumValue(view, value == null ? 0f : ((Double) value).doubleValue());
        break;
      case "step":
        mViewManager.setStep(view, value == null ? 0f : ((Double) value).doubleValue());
        break;
      case "testID":
        mViewManager.setTestID(view, value == null ? "" : (String) value);
        break;
      case "thumbImage":
        mViewManager.setThumbImage(view, (ReadableMap) value);
        break;
      case "thumbTintColor":
        mViewManager.setThumbTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "trackImage":
        mViewManager.setTrackImage(view, (ReadableMap) value);
        break;
      case "value":
        mViewManager.setValue(view, value == null ? 0f : ((Double) value).doubleValue());
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}