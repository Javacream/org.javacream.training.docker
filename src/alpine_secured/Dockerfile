FROM alpine

ENV USER_NAME=javcrea
ENV UID=1234
ENV GID=1234

RUN addgroup "$USER_NAME"
RUN adduser \
        --disabled-password \
        --gecos "" \
        --home "$(pwd)" \
        --ingroup "$USER_NAME" \
        --no-create-home \
        --uid "$UID" \
        "$USER_NAME"
USER "$USER_NAME"

