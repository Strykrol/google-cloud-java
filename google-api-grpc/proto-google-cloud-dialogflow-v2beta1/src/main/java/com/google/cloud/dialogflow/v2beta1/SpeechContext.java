// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Hints for the speech recognizer to help with recognition in a specific
 * conversation state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SpeechContext}
 */
public final class SpeechContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SpeechContext)
    SpeechContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpeechContext.newBuilder() to construct.
  private SpeechContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpeechContext() {
    phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SpeechContext(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                phrases_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              phrases_.add(s);
              break;
            }
          case 21:
            {
              boost_ = input.readFloat();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        phrases_ = phrases_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SpeechContext.class,
            com.google.cloud.dialogflow.v2beta1.SpeechContext.Builder.class);
  }

  private int bitField0_;
  public static final int PHRASES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList phrases_;
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * This list can be used to:
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList getPhrasesList() {
    return phrases_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * This list can be used to:
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public int getPhrasesCount() {
    return phrases_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * This list can be used to:
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public java.lang.String getPhrases(int index) {
    return phrases_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * This list can be used to:
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public com.google.protobuf.ByteString getPhrasesBytes(int index) {
    return phrases_.getByteString(index);
  }

  public static final int BOOST_FIELD_NUMBER = 2;
  private float boost_;
  /**
   *
   *
   * <pre>
   * Optional. Boost for this context compared to other contexts:
   * * If the boost is positive, Dialogflow will increase the probability that
   *   the phrases in this context are recognized over similar sounding phrases.
   * * If the boost is unspecified or non-positive, Dialogflow will not apply
   *   any boost.
   * Dialogflow recommends that you use boosts in the range (0, 20] and that you
   * find a value that fits your use case with binary search.
   * </pre>
   *
   * <code>float boost = 2;</code>
   */
  public float getBoost() {
    return boost_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < phrases_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phrases_.getRaw(i));
    }
    if (boost_ != 0F) {
      output.writeFloat(2, boost_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < phrases_.size(); i++) {
        dataSize += computeStringSizeNoTag(phrases_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPhrasesList().size();
    }
    if (boost_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, boost_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SpeechContext)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SpeechContext other =
        (com.google.cloud.dialogflow.v2beta1.SpeechContext) obj;

    if (!getPhrasesList().equals(other.getPhrasesList())) return false;
    if (java.lang.Float.floatToIntBits(getBoost())
        != java.lang.Float.floatToIntBits(other.getBoost())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPhrasesCount() > 0) {
      hash = (37 * hash) + PHRASES_FIELD_NUMBER;
      hash = (53 * hash) + getPhrasesList().hashCode();
    }
    hash = (37 * hash) + BOOST_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getBoost());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.SpeechContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Hints for the speech recognizer to help with recognition in a specific
   * conversation state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SpeechContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SpeechContext)
      com.google.cloud.dialogflow.v2beta1.SpeechContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SpeechContext.class,
              com.google.cloud.dialogflow.v2beta1.SpeechContext.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SpeechContext.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      boost_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechContext getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SpeechContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechContext build() {
      com.google.cloud.dialogflow.v2beta1.SpeechContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechContext buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SpeechContext result =
          new com.google.cloud.dialogflow.v2beta1.SpeechContext(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        phrases_ = phrases_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.phrases_ = phrases_;
      result.boost_ = boost_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SpeechContext) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SpeechContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SpeechContext other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SpeechContext.getDefaultInstance())
        return this;
      if (!other.phrases_.isEmpty()) {
        if (phrases_.isEmpty()) {
          phrases_ = other.phrases_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePhrasesIsMutable();
          phrases_.addAll(other.phrases_);
        }
        onChanged();
      }
      if (other.getBoost() != 0F) {
        setBoost(other.getBoost());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dialogflow.v2beta1.SpeechContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2beta1.SpeechContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList phrases_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensurePhrasesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        phrases_ = new com.google.protobuf.LazyStringArrayList(phrases_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getPhrasesList() {
      return phrases_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public int getPhrasesCount() {
      return phrases_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public java.lang.String getPhrases(int index) {
      return phrases_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public com.google.protobuf.ByteString getPhrasesBytes(int index) {
      return phrases_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder setPhrases(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhrasesIsMutable();
      phrases_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder addPhrases(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhrasesIsMutable();
      phrases_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder addAllPhrases(java.lang.Iterable<java.lang.String> values) {
      ensurePhrasesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, phrases_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder clearPhrases() {
      phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases that the speech
     * recognizer should recognize with higher likelihood.
     * This list can be used to:
     * * improve accuracy for words and phrases you expect the user to say,
     *   e.g. typical commands for your Dialogflow agent
     * * add additional words to the speech recognizer vocabulary
     * * ...
     * See the [Cloud Speech
     * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
     * limits.
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder addPhrasesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePhrasesIsMutable();
      phrases_.add(value);
      onChanged();
      return this;
    }

    private float boost_;
    /**
     *
     *
     * <pre>
     * Optional. Boost for this context compared to other contexts:
     * * If the boost is positive, Dialogflow will increase the probability that
     *   the phrases in this context are recognized over similar sounding phrases.
     * * If the boost is unspecified or non-positive, Dialogflow will not apply
     *   any boost.
     * Dialogflow recommends that you use boosts in the range (0, 20] and that you
     * find a value that fits your use case with binary search.
     * </pre>
     *
     * <code>float boost = 2;</code>
     */
    public float getBoost() {
      return boost_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Boost for this context compared to other contexts:
     * * If the boost is positive, Dialogflow will increase the probability that
     *   the phrases in this context are recognized over similar sounding phrases.
     * * If the boost is unspecified or non-positive, Dialogflow will not apply
     *   any boost.
     * Dialogflow recommends that you use boosts in the range (0, 20] and that you
     * find a value that fits your use case with binary search.
     * </pre>
     *
     * <code>float boost = 2;</code>
     */
    public Builder setBoost(float value) {

      boost_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Boost for this context compared to other contexts:
     * * If the boost is positive, Dialogflow will increase the probability that
     *   the phrases in this context are recognized over similar sounding phrases.
     * * If the boost is unspecified or non-positive, Dialogflow will not apply
     *   any boost.
     * Dialogflow recommends that you use boosts in the range (0, 20] and that you
     * find a value that fits your use case with binary search.
     * </pre>
     *
     * <code>float boost = 2;</code>
     */
    public Builder clearBoost() {

      boost_ = 0F;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SpeechContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SpeechContext)
  private static final com.google.cloud.dialogflow.v2beta1.SpeechContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SpeechContext();
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechContext> PARSER =
      new com.google.protobuf.AbstractParser<SpeechContext>() {
        @java.lang.Override
        public SpeechContext parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SpeechContext(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SpeechContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SpeechContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
